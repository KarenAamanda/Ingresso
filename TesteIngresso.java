import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TesteIngresso {
    private static List<Normal> lista;
    private static List<Vip> listav;
    public static void main (String[] args)
    {    
        int resp;
        Vip ingressov = new Vip();
        Normal ingresso = new Normal();

        lista = new ArrayList<Normal>();
        listav = new ArrayList<Vip>();

        
        for(int i = 1; i <= 6; i++)
        {
            resp = Integer.parseInt(JOptionPane.showInputDialog(i +" ingresso, escolha o tipo do ingresso desejado\n[1] Normal\n[2] Vip\n[3] Lista de ingressos" ));
            if(resp == 1)
            {
                ingresso.imprimeValor();
                JOptionPane.showMessageDialog(null, "\nDados do " + i + "° ingresso (Pista)");
                ingresso.imprimeDados();
                
                lista.add(ingresso);
            }    
            else if(resp == 2)
            {
                ingressov.imprimeValor();
                JOptionPane.showMessageDialog(null, "\nDados do " + i + " ingresso (Vip)");
                ingressov.imprimeDados();
                ingressov.imprimelocal();
                
                listav.add(ingressov);
            }
            else if(resp == 3)
            {
                relatorio();
                relatoriov();
                i--;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Tipo de ingresso inválido");
                i--;
            }
        }   
    }
    private static void relatorio() {
		String str = "Lista de Ingressos Normal(is):\n";
		for (Normal ingresso : lista)
			str += "\n" + ingresso;
		    JOptionPane.showMessageDialog(null, str);
    }

    private static void relatoriov() {
		String str2 = "Lista de Ingressos VIP:\n";
		for (Vip ingressov : listav)
			str2 += "\n" + ingressov;
            JOptionPane.showMessageDialog(null, str2);
    }

}