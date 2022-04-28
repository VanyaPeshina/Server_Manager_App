package io.getArrays.server.repo;


import io.getArrays.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    //the IP address will be unique, so the findBy will work out well
    Server findByIpAddress(String ipAddress);
}
