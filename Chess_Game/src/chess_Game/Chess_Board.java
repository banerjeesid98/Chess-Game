/**
 * Created by Rahul on 10-Sep-2018
 * 
 */
package chess_Game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;

public class Chess_Board extends JFrame
{
	JPanel p = new JPanel();
	Pieces_btn button[][] = new Pieces_btn[8][8];
	public static void main(String args[])
	{
		new Chess_Board();
	}
	public Chess_Board()
	{
		super("Chess Game");
		pack();
		setSize(600,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(8,8));
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				button[i][j]=new Pieces_btn();
				if((i+j) % 2 == 0)
					button[i][j].setBackground(Color.black);
				else
					button[i][j].setBackground(Color.white);
				p.add(button[i][j]);
			}
		}
		getContentPane().add(p);
		
		setVisible(true);
	}
}