package dad.endlessElectronicMusic.web;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comentario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String usuario;
	private String texto;
	// idType es False si es un comentario de blog y True si es un comentario de
	// Evento
	private boolean idType;

	public Comentario() {
	};

	public Comentario(long id, String usuario, String texto, boolean idType) {
		this.id = id;
		this.usuario = usuario;
		this.texto = texto;
		this.idType = idType;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isIdType() {
		return idType;
	}

	public void setIdType(boolean idType) {
		this.idType = idType;
	}

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", usuario=" + usuario + ", texto=" + texto + ", idType=" + idType + "]";
	}

}
