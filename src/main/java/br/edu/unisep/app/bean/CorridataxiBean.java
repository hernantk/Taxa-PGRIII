package br.edu.unisep.app.bean;

import br.edu.unisep.app.domain.dto.CorridaTaxidto;
import br.edu.unisep.app.domain.useCase.CorridaTaxiUseCase;
import lombok.Getter;
import lombok.Setter;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
@Getter
@Setter
public class CorridataxiBean {
    private Double valor = 0.00;


    private CorridaTaxidto corridaTaxi=new CorridaTaxidto();
    private CorridaTaxiUseCase corridaTaxiUse=new CorridaTaxiUseCase();

    public void calcular(){
        valor=corridaTaxiUse.calcular(corridaTaxi);

    }
    public void limpar(){
        CorridaTaxidto corridaTaxi=new CorridaTaxidto();
    }
}
