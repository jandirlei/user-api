package br.com.matrix.userapi.dto;

import java.time.LocalDateTime;

import br.com.matrix.userapi.model.User;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
	
	@NotBlank(message = "Nome é obrigatório")
    private String nome;
	
	@NotBlank(message = "CPF é obrigatório")
    private String cpf;
	
    private String endereco;
    
    @NotBlank(message = "E-mail é obrigatório")
    private String email;
    
    private String telefone;
    
    private LocalDateTime dataCadastro;
    
    private String key;
 
    public static UserDTO convert(User user) {
        UserDTO	userDTO = new UserDTO();
        userDTO.setNome(user.getNome());
        userDTO.setCpf(user.getCpf());
        userDTO.setEndereco(user.getEndereco());
        userDTO.setEmail(user.getEmail());
        userDTO.setTelefone(user.getTelefone());
        userDTO.setDataCadastro(user.getDataCadastro()); 
        userDTO.setKey(user.getKey());
        return userDTO;
    }

}
