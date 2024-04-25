package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Pedido;
import utilidades.Util;

public class PedidosService {
	Path pt=Path.of("pedidos.csv");
	//cada pedido se graba en una línea:
	//producto,unidades,fechaPedido
	public void borrarPedidos() {
		try {
			Files.deleteIfExists(pt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void nuevoPedido(Pedido pedido) {		
		try {
			Files.writeString(pt, Util.convertirPedidoACadena(pedido)+System.lineSeparator(), StandardOpenOption.APPEND,StandardOpenOption.CREATE);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public void nuevoPedido(String producto, int unidades, LocalDate fechaPedido) {
		Pedido p=new Pedido(producto,unidades,fechaPedido);
	
		nuevoPedido(p);
	}
	
	public Pedido pedidoMasReciente() {
		return Files.lines(pt) 			//Stream<String>
				.min(Comparator.comparing((Pedido p)->
					Util.convertirCadenaAPedido(p).getFechaPedido()));
				
		
//		return Files.lines(pt)//Stream<String>
//				.min(c->Util.convertirCadenaAPedido(c).fechaPedido);
//				.max(Comparator.comparing((Pedido p)->Util.convertirCadenaAPedido(p).getFechaPedido()));
//				.max(Comparator.comparing(Util.convertirCadenaAPedido(p)->p.getFechaPedido()));
//				.max(Comparator.comparing((Pedido p)->p.getFechaPedido())
//						.thenComparingInt(p->p.getUnidades()));
//		return pedidos.stream()//Stream<Pedido>
//				.max(Comparator.comparing((Pedido p)->p.getFechaPedido())
//						.thenComparingInt(p->p.getUnidades()));

//		return Files.lines(pt)
//				 .sorted(Comparator.comparing((Pedido c)->Util.convertirCadenaAPedido(c).getFechaInicio()))//Stream<Curso>
//				 .findFirst();
			
		/* 
		 * Pedido mas reciente
		 
			return pedidos.stream()//Stream<Pedido>
				.max(Comparator.comparing((Pedido p)->p.getFechaPedido())
						.thenComparingInt(p->p.getUnidades()));
		
		//*/
		
		/*
		Pedido pAux=null;
		LocalDate fMax=LocalDate.of(0,1,1); //1/1/1970
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			String linea;
			while((linea=bf.readLine())!=null) {
				Pedido p=Util.convertirCadenaAPedido(linea);
				//si encontramos pedido con fecha más reciente que fMax
				//actualizamos fMax y pAux
				if(p.getFechaPedido().isAfter(fMax)) {
					fMax=p.getFechaPedido();
					pAux=p;
				}
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return pAux;
//*/
	}
	
	public List<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		return Files.lines(pt)
				.filter((Pedido) p-> Util.convertirCadenaApedido(p). getFechaPedido().isAfter(f1) &&
						p->Util.convertirCadenaAPedido(p).getFechaPedido().isBefore(f2))
				.toList();
	}
	
	public Pedido pedidoProximoFecha(LocalDate fecha) {
		Pedido pAux=new Pedido();
		pAux.setFechaPedido(LocalDate.of(1, 1, 1));
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			String linea;
			while((linea=bf.readLine())!=null) {
				Pedido p=Util.convertirCadenaAPedido(linea);
				if(Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha))<
						Math.abs(ChronoUnit.DAYS.between(pAux.getFechaPedido(), fecha))) {
					pAux=p;
				}
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return pAux;
	}
	
	public void eliminarPedido(String producto) {
		
	}
	public List<Pedido> pedidos(){
		
	}
}
