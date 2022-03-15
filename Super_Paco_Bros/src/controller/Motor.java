/**
 * Recursos externos utilizados:
 * <br>
 * <ul>
 * <li><strong>LWJGL</strong>: Lightweight Java Game Library</li>
 * <li><strong>LWJGL OpenGL</strong>: Renderizador de graficos de LWJGL basado en OpenGL</li>
 * <li><strogn>LWJGL GLFW</strong>: Controlador de graficos de LWJGL basado en OpenGL</li>
 * </ul>
 * 
 * Documentaci�n:
 * <br>
 * <ul>
 * <li><a href="https://javadoc.lwjgl.org"><strong>LWJGL</strong></a></li>
 * </ul>
 */
package controller;

import org.lwjgl.opengl.*;
import view.Environment;
import view.graphics.Graphics;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;

/**
 *  <strong>Motor del Juego</strong>.
 *  
 *  <br><br>Es el principal rey y se�or del Paco Bros, sin el, nada funcionar�a :).
 *  
 *  @author Mario Gabriel N��ez Alc�zar de Velasco
 */
public class Motor extends Graphics{
	
	/**
	 * <strong>Main</strong>.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Environment graficos = new Environment(); // cargamos el entorno grafico inicial
		
		/*
		 * Cargamos la libreria de OpenGL
		 * 
		 * Este paso es esencial para la correcta ejecuci�n del juego
		 */
		GL.createCapabilities();
	
		charge(); // Cargamos los graficos del juego.
		
		//Ejecutamos el renderizado de los graficos.
		graficos.Frame(action.NEW);
		
		// Liberamos el retorno de la ventana y destruimos la instancia de la misma
		glfwFreeCallbacks(window);
		glfwDestroyWindow(window);
	
		// Terminamos la ejecuci�n del controlador de gr�ficos y liberamos el retorno de los errores.  
		glfwTerminate();
		glfwSetErrorCallback(null).free();
	}
}