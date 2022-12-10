import javax.swing.JOptionPane;
public class Vip extends Ingresso
{
    private String local;
    private double vad;

    //getters
    public String getLocal () {
        return this.local;
    
    }
    public double getVad () {
        return this.vad;
    }

    //Setters
    public void setLocal (String local) {
        this.local = local;
    }
    public void setVad (double vad) {
        this.vad = vad;
    }
    
    //Construtor padrão
    public Vip ()
    {
        super();

        this.local = "A1";
        this.vad = (this.preco * 0.3) + this.preco;
        
    }

    //Métodos
    public void imprimeValor()
    {
        JOptionPane.showMessageDialog(null, "\nO valor do ingresso VIP e: R$" + this.vad);

    }
    public void imprimelocal()
    {
        JOptionPane.showMessageDialog(null, "\nO local do camarote sera: " + this.local);

    }

    @Override
    public String toString() {
        return data + " - " + horario + " - Local:" + local + " - Preco: " + vad;
     }


}
