
package com.portfolio.Mariano.Security.Service;

import com.portfolio.Mariano.Security.Entity.Rol;
import com.portfolio.Mariano.Security.Enums.RolNombre;
import com.portfolio.Mariano.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
   @Autowired
   IRolRepository IrolRepository;
   
   public Optional<Rol> getByRolNombre(RolNombre rolNombre){
       return IrolRepository.findByRolNombre(rolNombre);
   }
   public void save (Rol rol){
       IrolRepository.save(rol);
   }
}

