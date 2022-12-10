import javax.swing.JOptionPane;
public class Normal extends Ingresso
{
    private double pnormal;

    //getters
    public double getPnormal () {
        return this.pnormal;
    }

    //Setters
    public void setPnormal (double pnormal) {
        this.pnormal = pnormal;
    }
    
    //Construtor padrão
    public Normal ()
    {
        super();
        this.pnormal = this.preco;

    }

    //Métodos
    public void imprimeValor()
    {
        JOptionPane.showMessageDialog(null, "\nO valor do ingresso Normal e: R$" + this.pnormal);
 
    }
    @Override
    public String toString() {
        return data + " - " + horario + " - Pista" + " - Preco:" + pnormal;
     }
}