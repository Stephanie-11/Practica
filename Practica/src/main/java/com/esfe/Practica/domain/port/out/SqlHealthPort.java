package com.esfe.Practica.domain.port.out;

public interface SqlHealthPort {
    boolean ping() throws Exception;
}
