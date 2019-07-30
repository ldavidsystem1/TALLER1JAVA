package main;

import static entidades.Nota.*;
import entidades.notas.Nota;
import static entidades.Msjes.*;
import javax.swing.*;
public class Main {



    public static void main(String[] arg)
    {
        Nota nota = new Nota();
        String seg = JOptionPane.showInputDialog(null, MSJE_S.getMsje());
        nota.setnSeg(Double.parseDouble(seg));

        String parc = JOptionPane.showInputDialog(null, MSJE_P.getMsje());
        nota.setnPar(Double.parseDouble(parc));

        String nFinal = JOptionPane.showInputDialog(null, MSJE_F.getMsje());
        nota.setnFinal(Double.parseDouble(nFinal));




        if (nota.calcularNota()>=0 && nota.calcularNota()<=0.9)
        {
            JOptionPane.showMessageDialog(null, C5.getMsje()+nota.calcularNota());
        }else if (nota.calcularNota()<=1.9)
        {
            JOptionPane.showMessageDialog(null,C4.getMsje()+nota.calcularNota());
        }else if (nota.calcularNota()<=2.9)
        {
            JOptionPane.showMessageDialog(null,C3.getMsje()+nota.calcularNota());
        }else if ( nota.calcularNota()<=3.9)
        {
            JOptionPane.showMessageDialog(null,C2.getMsje()+nota.calcularNota());
        }else if (nota.calcularNota()<=5)
        {
            JOptionPane.showMessageDialog(null,C1.getMsje()+nota.calcularNota());
        }
    }
}
