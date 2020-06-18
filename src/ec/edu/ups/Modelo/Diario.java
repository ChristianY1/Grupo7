package ec.edu.ups.Modelo;

public class Diario {
		private int codigo;
		private Caja caja;
		
		
		public Diario() {
			super();
		}


		public Diario(int codigo, Caja caja) {
			super();
			this.codigo = codigo;
			this.caja = caja;
		}


		public int getCodigo() {
			return codigo;
		}


		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}


		public Caja getCaja() {
			return caja;
		}


		public void setCaja(Caja caja) {
			this.caja = caja;
		}
		
		
		
}
