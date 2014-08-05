package com.projeto.facade;

import java.util.LinkedList;
import java.util.List;

import com.projeto.exception.TutorDuplicadoException;
import com.projeto.exception.TutorExistenteException;
import com.projeto.exception.TutorInexistenteException;
import com.projeto.negocios.Tutor;

public class CadastrarERemover {
	
	private List<Tutor> tutores = new LinkedList<Tutor>();

	public void cadastraTutor(Tutor tutorNovo) throws Exception {
		boolean existe = false;
		for (Tutor tutorAntigo : this.tutores) {
			if (tutorAntigo.getMatricula().equals(tutorNovo.getMatricula())) {
				existe = true;
				throw new TutorDuplicadoException();
			}
		}
		if (existe == false) {
			this.tutores.add(tutorNovo);
		} else {
			throw new TutorExistenteException("Tutor Existente");
		}
	}
	
	public List<Tutor> getListaDeTutores() {

		return tutores;
	}
	
	public Tutor pesquisarTutorPeloId(String id)
			throws TutorInexistenteException {
		for (Tutor t : this.tutores) {
			if (t.getMatricula().equals(id)) {
				return t;
			}
		}
		throw new TutorInexistenteException("Tutor Inexistente");
	}
	
	
}