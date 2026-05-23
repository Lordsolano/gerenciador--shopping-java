package Classes;

public class Data {
    public int Dia;
    public int Mes;
    public int Ano;

    public Data(int Dia, int Mes, int Ano) {
        if (dataValida(Dia, Mes, Ano)) {
            this.Dia = Dia;
            this.Mes = Mes;
            this.Ano = Ano;
        } else {
            System.out.println("Data inválida! Ajustando para 01/01/2000.");
            this.Dia = 1;
            this.Mes = 1;
            this.Ano = 2000;
        }
    }
    private boolean dataValida(int d, int m, int a) {
        if (m < 1 || m > 12 || d < 1) return false;

        int maxDias;

        switch (m) {
            case 4: case 6: case 9: case 11:
                maxDias = 30;
                break;
            case 2:
                maxDias = (VerificaanoBissexto(a)) ? 29 : 28;
                break;
            default:
                maxDias = 31;
        }

        return d <= maxDias;
    }
    private boolean VerificaanoBissexto(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }
    @Override
    public String toString(){
        return Dia + "/" + Mes + "/" + Ano;
    }

}
