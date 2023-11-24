package com.xworkz.camera.boot;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Stream;
import com.xworkz.camera.app.dto.IceCreamDTO;

public class IceCreamRunner {
    public static void main(String[] args) {
        System.out.println("Invoking IceCreamRunner in Main");
        IceCreamDTO dto1 = new IceCreamDTO("Chocalate", "Cone", 80, LocalDate.of(2023, 10, 8), "Brown");
        IceCreamDTO dto2 = new IceCreamDTO("Vanilla", "Cup", 10, LocalDate.of(2023, 8, 18), "White");
        IceCreamDTO dto3 = new IceCreamDTO("Strawberry", "Softy", 40, LocalDate.of(2023, 9, 30), "Pink");
        IceCreamDTO dto4 = new IceCreamDTO("ButterScotch", "FamilyPack", 200, LocalDate.of(2023, 8, 8), "Yellow");
        IceCreamDTO dto5 = new IceCreamDTO("Pista", "FamilyPack", 150, LocalDate.of(2023, 7, 24), "PistaColor");

        Comparator<IceCreamDTO> com = (t1, t2) -> t2.getFlavours().compareTo(t1.getFlavours());

        Stream.of(dto5, dto4, dto3, dto2, dto1).sorted(com).forEach(i -> System.out.println(i));
        
        System.out.println("***************************");
          
        Comparator<IceCreamDTO> com1 = (t1, t2) -> t2.getManufactureDate().compareTo(t1.getManufactureDate());

        
        Stream.of(dto5, dto4, dto3, dto2, dto1)
            .sorted(com1)
            .forEach(i -> System.out.println(i));
        
        System.out.println("***************************");
        
        Comparator<IceCreamDTO> com2 = (t1, t2) -> t1.getColor().compareTo(t2.getColor());

        Stream.of(dto5, dto4, dto3, dto2, dto1)
            .sorted(com2)
            .forEach(i -> System.out.println(i));
        
        System.out.println("***************************");
        
        Comparator<IceCreamDTO> com3 = (t1, t2) -> t2.getType().compareTo(t1.getType());

        Stream.of(dto5, dto4, dto3, dto2, dto1)
            .sorted(com3)
            .forEach(i -> System.out.println(i));
        
        System.out.println("***************************");
        
        Comparator
                .comparing(IceCreamDTO::getPrice) // Sort by price in ascending order
;
		Comparator<IceCreamDTO> com4 = Comparator
                .comparing(IceCreamDTO::getManufactureDate); // Then sort by date in ascending order

            Stream.of(dto5, dto4, dto3, dto2, dto1)
                .sorted(com4)
                .forEach(i -> System.out.println(i));
    }
}
