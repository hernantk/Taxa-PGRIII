package br.edu.unisep.app.domain.useCase;

import br.edu.unisep.app.domain.dto.CorridaTaxidto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CorridaTaxiUseCase {

    private static final int BANDEIRA1 = 1;
    private static final int BANDEIRA2 = 2;
    private static final double VALOR = 2.75;
    private static final double ACRESCIMO = 1.3;

    public Double calcular(CorridaTaxidto corridaTaxidto){
        if (corridaTaxidto.getBandeira()== BANDEIRA1){
            return (corridaTaxidto.getDistancia()* VALOR);
        }
        else if(corridaTaxidto.getBandeira()== BANDEIRA2){
            return ((corridaTaxidto.getDistancia()*VALOR)* ACRESCIMO);
        }
        return 0d;
    }
}
