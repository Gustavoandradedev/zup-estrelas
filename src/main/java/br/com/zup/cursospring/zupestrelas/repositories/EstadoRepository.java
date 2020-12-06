package br.com.zup.cursospring.zupestrelas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.zup.cursospring.zupestrelas.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
    
    

}
