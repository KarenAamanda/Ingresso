import javax.swing.JOptionPane;
public class Ingresso
{
    protected String data;
    protected String horario;
    protected float preco;

     //getters
     public String getData () {
        return this.data;
    
    }
    public String getHorario () {
        return this.horario;
    }

    public float getPreco () {
        return this.preco;
    }

    //Setters
    public void setData (String data) {
        this.data = data;
    }
    public void setHorario (String horario) {
        this.horario = horario;
    }
    public void setPreco (float preco) {
        this.preco = preco;
    }

    //Construtor padrão
    public Ingresso ()
    {
        this.data = "07/04/2022";
        this.horario = "18:30:00";
        this.preco = 120;
    }

    //Métodos
    public void imprimeDados()
    {
        JOptionPane.showMessageDialog(null, "\nData: " + this.data + "\nHorario: " + this.horario);
    }

    public void imprimeValor()
    {
        JOptionPane.showMessageDialog(null, "\nPreco: R$" + this.preco);
    }

    @Override
    public String toString() {
        return data + " - " + horario + " - duracao: " + preco;
     }


}