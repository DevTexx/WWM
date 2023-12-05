package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;

import interfaces.Player;
import interfaces.Player1;
import interfaces.Player2;
import screens.HomeScreen;
import screens.ScreenManager;
import texts.LabelManager;
import texts.TextMessages;

public class Main {
	
	private static boolean running = true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScreenManager.setCurrentScreen(new HomeScreen());
		while(programmIsRunning()) {
			if (ScreenManager.getCurrentScreen() == new HomeScreen()) {
				continue;
			}
		}
	}

	private static boolean programmIsRunning() {
		return running;
	}
	
	
}
