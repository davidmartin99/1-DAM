float numero = 1.42000000
//Limitar el numero decimales

//1ºforma
System.out.printf("El valor del numero es %.2f",numero);

//2ºforma
System.out.println("El valor del numero es: "+String.format("%.2f",numero));

//3ºforma
DecimalFormat df = new DecimalFormat("#.00");
System.out.println(df.format(numero));

//Redondear partes decimales
System.out.println((float)Math.round(numero*100d)/100d);