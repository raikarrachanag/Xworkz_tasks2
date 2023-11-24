package com.xworkz.camera.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.camera.app.dto.CameraDTO;

public class CameraRunner {

	public static void main(String[] args) {
		System.out.println("Invoking CameraRunner in Main");
		CameraDTO dto1=new CameraDTO(1,"Sony", "Sony M30", 49000, LocalDate.of(2001, 10, 30));
		CameraDTO dto2=new CameraDTO(2,"Canon", "Canon Alpha 7", 12000, LocalDate.of(2001, 05, 31));
		CameraDTO dto3=new CameraDTO(3,"Nikon", "Nikon 3SEE", 10000, LocalDate.of(2004, 6, 15));
		CameraDTO dto4=new CameraDTO(4,"Olympus", "Olympus M21", 8000, LocalDate.of(2002, 11, 7));
		CameraDTO dto5=new CameraDTO(5,"Samsung", "Samsung M20", 45000, LocalDate.of(2001, 12, 8));
		
		Collection<CameraDTO> cameraCollection=new ArrayList<CameraDTO>();
		cameraCollection.add(dto1);
		cameraCollection.add(dto2);
		cameraCollection.add(dto3);
		cameraCollection.add(dto4);
		cameraCollection.add(dto5);
		
		cameraCollection.stream().filter(Camera->Camera.getBrand().equals("Canon")).forEach(Camera->System.out.println(Camera));
		
		Collection<String> models=new ArrayList<String>();
		
		cameraCollection.stream().filter(Camera->Camera.getBrand().equals("Canon")).forEach(Camera->models.add(Camera.getModel()));
		models.forEach(s->System.out.println(s));	
		//for model we can use both method
		//cameraCollection.stream().filter(Camera->Camera.getCost()>40000).collect(Collectors.toList()).forEach(Camera->System.out.println(Camera.getModel()));
		
		System.out.println("================");
		
		cameraCollection.stream().filter(c->c.getBrand().equals("Sony"))
		.map(cam->cam.getCost())
		.forEach(p->System.out.println(p));
		//.collect(Collectors.toList());
	}
}
