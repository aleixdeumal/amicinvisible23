
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"Daniel Barbancho Montero",
					"Xavier Bermúdez Molgó",
					"Joel Berrocal Urbina",
					"Marc Bouzas Guadalupe",
					"Nil Carvajal Playa",
					"Quim Comas Navarro",
					"Aleix Deumal Tripiana",
					"Pau Domènech Pacheco",
					"Gerard Fernández Requena",
					"Sergio Garcia Ruiz",
					"Adrián Gil Moreno",
					"Oriol Pacheco Acevedo",
					"Marcel Josep Paulí Lara",
					"Pol Pavon Pozo",
					"Gerard Pedrero Carbonell",
					"Martí Puig Martín",
					"Ruben Recolons Reig",
					"Josep Recolons Rodriguez",
					"Pau Riera Mas",
					"Carlos Abel Silva Teixeira",
					"Joan Pardo Campillo"};
		
		int b[][]=new int [21][2];
		String m[][]=new String [21][2];
		
		
		for (int i=0; i<m.length; i++) { //omplir matriu 1
			for (int j=0; j<m[0].length; j++) {
				while (b[i][j]!=1) {
				m[i][j]=a[generaNumAleatorio(0,20)];
				b[i][j]=1;
				}
			}
		}
		for (int i=0; i<m.length; i++) { //Matriu resultat 
			for (int j=0; j<m[0].length; j++) {
				System.out.print(m[i][j]+" | ");
			}
			System.out.println("");
		}
	}
		public static int generaNumAleatorio(int minimo,int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
         
    }

}
