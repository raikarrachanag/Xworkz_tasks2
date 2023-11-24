package com.xworkz.camera.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.camera.app.dto.TheaterDTO;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in TheaterRunner");
		TheaterDTO dto1=new TheaterDTO("Lakshmi Theater", "Channagiri", 250, 2, true);
		TheaterDTO dto2=new TheaterDTO("Veerabreshwara Theater", "Channagiri", 150, 1, false);
		TheaterDTO dto3=new TheaterDTO("Manjunatha Theater", "Shivamogga", 250, 2, true);
		TheaterDTO dto4=new TheaterDTO("Navarang Theater", "Bangalore", 260, 2, true);
		TheaterDTO dto5=new TheaterDTO("HPC Talkies", "Shivamogga", 240, 2, true);
		
		Collection<TheaterDTO> theaterCollection=new ArrayList<TheaterDTO>();
		theaterCollection.add(dto1);
		theaterCollection.add(dto2);
		theaterCollection.add(dto3);
		theater
	}
		
	}
}
