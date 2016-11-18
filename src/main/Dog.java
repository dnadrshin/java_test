package main;

public class Dog {
		String name;
		Boolean isModified = false;
		public Dog(String name){
			this.name = name;
		}
		
		public void Sound(){
			
			String name = "dsfsdf";
			Modify();
			System.out.println(this.name);
		}
		
		private void Modify(){
			if(!isModified){
				this.name = this.name + " dog!";
				isModified = true;
			}
		}
		
		
}
