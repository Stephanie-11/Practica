package com.esfe.Practica.application.usecase;

import com.esfe.Practica.domain.port.in.CheckDbHealtUseCase;
import com.esfe.Practica.domain.port.out.SqlHealthPort;
/**
 * implementacion del caso de uso (sin anotaciones de spring)
 * Orquesta el puerto de salida para mantener el dominio aislado
 */

public class CheckDbHealthService implements CheckDbHealtUseCase {
    private final SqlHealthPort sql;
    public CheckDbHealthService(SqlHealthPort sql){
        this.sql=sql;

    }
    @Override
    public boolean isHealthy()
    {
        try{
            return sql.ping();
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
