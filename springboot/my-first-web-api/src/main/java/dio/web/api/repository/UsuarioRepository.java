package dio.web.api.repository;


import dio.web.api.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Atualizando o usuário na camada de repositório");
        }
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("user1", "secret"));
        usuarios.add(new Usuario("user2", "secret"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("Find/id - Recebendo o id: %d para localizar um usuário%n", id);
        return new Usuario("user1", "secret");
    }

    public Usuario findByUserName(String username) {
        System.out.printf("Find/username - Recebendo o username: %s para localizar um usuário%n", username);
        return new Usuario("user2", "secret");
    }

}
