import java.util.ArrayList;

public class Laboratory {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Professor> professors;

  public Laboratory() {
  }

  public Laboratory(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.professors = new ArrayList<Professor>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addMember(Student s) {
    this.students.add(s);
  }

  public void addMember(Professor p) {
    this.professors.add(p);
  }
  
  public ArrayList<String> getContactInfos() {
    // COMPLETE-ME
    // Construa um ArrayList<String> contendo informações de contato (ContactInfo)
    // de cada um dos estudantes e professores
    ArrayList<String> contactInfos = new ArrayList<String>();
    for( int i = 0 ; i < students.size() ; i++){
      contactInfos.add(students.get(i).getContactInfo());
    }
    for( int i = 0 ; i < professors.size() ; i++){
      contactInfos.add(professors.get(i).getContactInfo());
    }
    return contactInfos;
  }

  public boolean userExists(String userId) {
    // COMPLETE-ME
    // Verifique se existe o userId na lista de estudantes ou de professores
    
    for(int i = 0; i < professors.size(); i++){
      if( professors.get(i).getUserId() == userId ) //verificar utilização do cointans
        return true;
    }
    for(int i = 0; i < students.size(); i++){
      if( students.get(i).getUserId() == userId )
        return true;
    }
    return false;
  }

  public int countMembers() {
    // COMPLETE-ME
    // Retorne o total de membros do laboratório (estudantes e professores)

    return ( students.size() + professors.size() );
    
  }


}