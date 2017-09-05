package Encontre.Telefone;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncontreTeste {
	
		@Test
		 public void testConverteLetra1(){
		 int numeros = Encontre.converteLetraEmNumero("1");
		 assertEquals(1,numeros);
		 }
		
		@Test
		 public void testConverteLetra0(){
		 int numeros = Encontre.converteLetraEmNumero("0");
		 assertEquals(0,numeros);
		 }
		
		@Test
		 public void testConverteLetraHifen(){
		 String Hifen = Encontre.converteLetraHifen("-");
		 assertEquals("-",Hifen);
		 }

		@Test
		 public void testConverteLetraA(){
		 int numeros = Encontre.converteLetraEmNumero("A");
		 assertEquals(2,numeros);
		 }
		
		@Test
		 public void testConverteLetraB(){
		 int numeros = Encontre.converteLetraEmNumero("B");
		 assertEquals(2,numeros);
		 }
		
		@Test
		 public void testConverteLetraC(){
		 int numeros = Encontre.converteLetraEmNumero("C");
		 assertEquals(2,numeros);
		 }
		
		@Test
		 public void testConverteLetraD(){
		 int numeros = Encontre.converteLetraEmNumero("D");
		 assertEquals(3,numeros);
		 }
		
		@Test
		 public void testConverteLetraE(){
		 int numeros = Encontre.converteLetraEmNumero("E");
		 assertEquals(3,numeros);
		 }
		
		@Test
		 public void testConverteLetraF(){
		 int numeros = Encontre.converteLetraEmNumero("F");
		 assertEquals(3,numeros);
		 }
		
		@Test
		 public void testConverteLetraG(){
		 int numeros = Encontre.converteLetraEmNumero("G");
		 assertEquals(4,numeros);
		 }
		
		@Test
		 public void testConverteLetraH(){
		 int numeros = Encontre.converteLetraEmNumero("H");
		 assertEquals(4,numeros);
		 }
		
		@Test
		 public void testConverteLetraI(){
		 int numeros = Encontre.converteLetraEmNumero("I");
		 assertEquals(4,numeros);
		 }
		
		@Test
		 public void testConverteLetraJ(){
		 int numeros = Encontre.converteLetraEmNumero("J");
		 assertEquals(5,numeros);
		 }
		
		@Test
		 public void testConverteLetraK(){
		 int numeros = Encontre.converteLetraEmNumero("K");
		 assertEquals(5,numeros);
		 }
		
		@Test
		 public void testConverteLetraL(){
		 int numeros = Encontre.converteLetraEmNumero("L");
		 assertEquals(5,numeros);
		 }
		
		@Test
		 public void testConverteLetraM(){
		 int numeros = Encontre.converteLetraEmNumero("M");
		 assertEquals(6,numeros);
		 }
		
		@Test
		 public void testConverteLetraN(){
		 int numeros = Encontre.converteLetraEmNumero("N");
		 assertEquals(6,numeros);
		 }
		
		@Test
		 public void testConverteLetraO(){
		 int numeros = Encontre.converteLetraEmNumero("O");
		 assertEquals(6,numeros);
		 }
		
		@Test
		 public void testConverteLetraP(){
		 int numeros = Encontre.converteLetraEmNumero("P");
		 assertEquals(7,numeros);
		 }
		
		@Test
		 public void testConverteLetraQ(){
		 int numeros = Encontre.converteLetraEmNumero("Q");
		 assertEquals(7,numeros);
		 }
		
		@Test
		 public void testConverteLetraR(){
		 int numeros = Encontre.converteLetraEmNumero("R");
		 assertEquals(7,numeros);
		 }
		
		@Test
		 public void testConverteLetraS(){
		 int numeros = Encontre.converteLetraEmNumero("S");
		 assertEquals(7,numeros);
		 }
		
		@Test
		 public void testConverteLetraT(){
		 int numeros = Encontre.converteLetraEmNumero("T");
		 assertEquals(8,numeros);
		 }
		
		@Test
		 public void testConverteLetraU(){
		 int numeros = Encontre.converteLetraEmNumero("U");
		 assertEquals(8,numeros);
		 }
		
		@Test
		 public void testConverteLetraV(){
		 int numeros = Encontre.converteLetraEmNumero("V");
		 assertEquals(8,numeros);
		 }
		
		@Test
		 public void testConverteLetraW(){
		 int numeros = Encontre.converteLetraEmNumero("W");
		 assertEquals(9,numeros);
		 }
		
		@Test
		 public void testConverteLetraX(){
		 int numeros = Encontre.converteLetraEmNumero("X");
		 assertEquals(9,numeros);
		 }
		
		@Test
		 public void testConverteLetraY(){
		 int numeros = Encontre.converteLetraEmNumero("Y");
		 assertEquals(9,numeros);
		 }
		
		@Test
		 public void testConverteLetraZ(){
		 int numeros = Encontre.converteLetraEmNumero("Z");
		 assertEquals(9,numeros);
		 }
		
		 @Test(expected = IllegalArgumentException.class)
		 public void testConverteEmNumeroInvalido(){
		 String letra = Encontre.converteEmNumeroInvalido("2");
		 }
		 
		 @Test
		 public void testConverteLetraAA(){
		 int numeros = Encontre.converteLetraEmNumeroDoisDigitos("AA");
		 assertEquals(22,numeros);
		 }
		 
		 @Test
		 public void testConverteLetraBD(){
		 int numeros = Encontre.converteLetraEmNumeroDoisDigitos("BD");
		 assertEquals(23,numeros);
		 }
		 
		 @Test
		 public void testValorNull(){
		 String letra = Encontre.ValorNull("");
		 assertEquals("", letra);
		 }
		 
		 @Test
		 public void testConvertePalavraMICHELE(){
		 int numeros = Encontre.convertePalavra("MICHELE");
		 assertEquals(6424353, numeros);
		 }
		 
		 @Test
		 public void testConverteFrase(){
		 String letra = Encontre.converteFrase("1-HOME-SWEET-HOME-MY-MISERABLE-JOB");
		 assertEquals(1-4663-79338-4663-69-647372253-562, letra);
		 }
		 
		 
		 
}
		

