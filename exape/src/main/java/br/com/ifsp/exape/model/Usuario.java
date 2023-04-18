package br.com.ifsp.exape.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "O nome de usuário é obrigatório")
    private String username;

    @NotNull(message = "A senha é obrigatória")
    @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
    private String password;

    @NotNull(message = "O nome é obrigatório")
    private String nome;

    @NotNull(message = "O e-mail é obrigatório")
    @Email(message = "O e-mail deve ser válido")
    private String email;

    @NotNull(message = "O papel é obrigatório")
    @Enumerated(EnumType.STRING)
    private Papel papel;

}
