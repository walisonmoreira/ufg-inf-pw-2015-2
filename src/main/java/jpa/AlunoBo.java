package jpa;

import java.util.List;

//Business Object.
public class AlunoBo {

  AlunoDao alunoDao;

  public AlunoBo() {
    alunoDao = new AlunoDao();
  }

  public void incluir(Aluno aluno) {
    if (!aluno.getMatricula().equals("")) {
      alunoDao.incluir(aluno);
    }
  }

  public List<Aluno> listar() {
    return alunoDao.listar();
  }

}
