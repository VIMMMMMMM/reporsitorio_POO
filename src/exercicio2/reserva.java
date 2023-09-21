package exercicio2;

import exercicio2.DominioExecoes.DominioExecoes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class reserva {
        private Integer numeroDoQuarto;
        private Date checkIn;
        private Date checkOut;
        private static SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        public  reserva(Integer numeroDoQuarto, Date checkIn, Date checkOut) throws DominioExecoes {
            if (!checkOut.after(checkIn))
                throw new DominioExecoes(" check out deve ser depois de check in") ;
            this.numeroDoQuarto= numeroDoQuarto;
            this.checkIn=checkIn;
            this.checkOut=checkOut;
        }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(Integer numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }
    public long duracao(){
            long diferenca = checkOut.getTime()-checkIn.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);

    }
    public void  atualizacaoDeDatas(Date checkIn, Date checkOut) throws DominioExecoes {
            Date agora = new Date();
            if(checkIn.before(agora)||checkOut.before(agora))
                throw new DominioExecoes(" datas de reserva devem ser futuras");
            if (!checkOut.after(checkIn))
                throw new DominioExecoes(" check out deve ser depois de check in") ;
            this.checkIn=checkIn;
            this.checkOut=checkOut;

    }

    @Override
    public String toString() {
        return "quarto: "+numeroDoQuarto+", check in: "+dateFormat.format(checkIn)+", check out: "+dateFormat.format(checkOut)+", "+duracao()+" noites";
    }
}
