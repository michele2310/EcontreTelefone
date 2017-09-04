package Encontre.Telefone;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncontreTeste {
	
		@Test
		 public void testConverteLetra1(){
		 int valor = Encontre.converteEmNumero("1");
		 assertEquals(1,valor);
		 }
		
		@Test
		 public void testConverteLetra0(){
		 int valor = Encontre.converteEmNumero("0");
		 assertEquals(0,valor);
		 }

		@Test
		 public void testConverteLetraA(){
		 int valor = Encontre.converteEmNumero("A");
		 assertEquals(2,valor);
		 }
		
		@Test
		 public void testConverteLetraB(){
		 int valor = Encontre.converteEmNumero("B");
		 assertEquals(2,valor);
		 }
		
		@Test
		 public void testConverteLetraC(){
		 int valor = Encontre.converteEmNumero("C");
		 assertEquals(2,valor);
		 }
		
		@Test
		 public void testConverteLetraD(){
		 int valor = Encontre.converteEmNumero("D");
		 assertEquals(3,valor);
		 }
		
		@Test
		 public void testConverteLetraE(){
		 int valor = Encontre.converteEmNumero("E");
		 assertEquals(3,valor);
		 }
		
		@Test
		 public void testConverteLetraF(){
		 int valor = Encontre.converteEmNumero("F");
		 assertEquals(3,valor);
		 }
		
		@Test
		 public void testConverteLetraG(){
		 int valor = Encontre.converteEmNumero("G");
		 assertEquals(4,valor);
		 }
		
		@Test
		 public void testConverteLetraH(){
		 int valor = Encontre.converteEmNumero("H");
		 assertEquals(4,valor);
		 }
		
		@Test
		 public void testConverteLetraI(){
		 int valor = Encontre.converteEmNumero("I");
		 assertEquals(4,valor);
		 }
		
		@Test
		 public void testConverteLetraJ(){
		 int valor = Encontre.converteEmNumero("J");
		 assertEquals(5,valor);
		 }
		
		@Test
		 public void testConverteLetraK(){
		 int valor = Encontre.converteEmNumero("K");
		 assertEquals(5,valor);
		 }
		
		@Test
		 public void testConverteLetraL(){
		 int valor = Encontre.converteEmNumero("L");
		 assertEquals(5,valor);
		 }
		
		@Test
		 public void testConverteLetraM(){
		 int valor = Encontre.converteEmNumero("M");
		 assertEquals(6,valor);
		 }
		
		@Test
		 public void testConverteLetraN(){
		 int valor = Encontre.converteEmNumero("N");
		 assertEquals(6,valor);
		 }
		
		@Test
		 public void testConverteLetraO(){
		 int valor = Encontre.converteEmNumero("O");
		 assertEquals(6,valor);
		 }
		
		@Test
		 public void testConverteLetraP(){
		 int valor = Encontre.converteEmNumero("P");
		 assertEquals(7,valor);
		 }
		
		@Test
		 public void testConverteLetraQ(){
		 int valor = Encontre.converteEmNumero("Q");
		 assertEquals(7,valor);
		 }
		
		@Test
		 public void testConverteLetraR(){
		 int valor = Encontre.converteEmNumero("R");
		 assertEquals(7,valor);
		 }
		
		@Test
		 public void testConverteLetraS(){
		 int valor = Encontre.converteEmNumero("S");
		 assertEquals(7,valor);
		 }
		
		@Test
		 public void testConverteLetraT(){
		 int valor = Encontre.converteEmNumero("T");
		 assertEquals(8,valor);
		 }
		
		@Test
		 public void testConverteLetraU(){
		 int valor = Encontre.converteEmNumero("U");
		 assertEquals(8,valor);
		 }
		
		@Test
		 public void testConverteLetraV(){
		 int valor = Encontre.converteEmNumero("V");
		 assertEquals(8,valor);
		 }
		
		@Test
		 public void testConverteLetraW(){
		 int valor = Encontre.converteEmNumero("W");
		 assertEquals(9,valor);
		 }
		
		@Test
		 public void testConverteLetraX(){
		 int valor = Encontre.converteEmNumero("X");
		 assertEquals(9,valor);
		 }
		
		@Test
		 public void testConverteLetraY(){
		 int valor = Encontre.converteEmNumero("Y");
		 assertEquals(9,valor);
		 }
		
		@Test
		 public void testConverteLetraZ(){
		 int valor = Encontre.converteEmNumero("Z");
		 assertEquals(9,valor);
		 }
}
