package dio.web.api.repository;

import dio.web.api.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class UserRepository {

  public void save(User usuario) {
    System.out.println("SAVE - Recebendo o usuário na camada de repositório");
    System.out.println(usuario);
  }

  public void update(User usuario) {
    System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
    System.out.println(usuario);
  }

  public void remove(Integer id) {
    System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
    System.out.println(id);
  }

  public List<User> listAll() {
    List<User> usuarios = new ArrayList<>();
    usuarios.add(new User("gleyson", "password"));
    usuarios.add(new User("frank", "masterpass"));
    return usuarios;
  }

  public User finById(Integer id) {
    System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
    return new User("gleyson", "password");
  }

}
