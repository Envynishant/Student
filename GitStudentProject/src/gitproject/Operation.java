package gitproject;



public class Operation {
	private Student[] stds;
	private int index;

	Operation(int size){
		stds=new Student[size];
	}
	public void addStudent(Student s) {
		stds[index++]=s;
	}
	public void showAllStudent() {
		for(int i=0;i<stds.length;i++) {
			if(stds[i]!=null) {
				System.out.println(stds[i].getRoll()+"\t" +stds[i]);
			}
		}
	}
	    
	   public boolean delete(int roll) {
		   boolean status=false;
		   for(int i=0;i<stds.length;i++) {
				if(stds[i]!=null) {
					if(stds[i].getRoll()==roll) {
						stds[i]=null;
						status =true;
					}
				}
			}
		   return status;
	   }
	public Student findStudentByRoll(int roll) {
		Student std=null;
		for(int i=0;i<stds.length;i++) {
			if(stds[i]!=null) {
				if(stds[i].getRoll()==roll) {
					std=stds[i];
				}
			}
	}
		return std;
	}
	public Student findStudentByName(String name) {
		Student std=null;
		for(int i=0;i<stds.length;i++) {
			if(stds[i]!=null) {
				if(stds[i].getName().equals(name)) {
					std=stds[i];
				}
			}
	}
		return std;

	}

	}


