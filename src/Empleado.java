import java.util.Scanner;

public class Empleado extends Nomina{
        private String Sexo;
        private String NumeroDeCuenta;
        private String NombreDeConyuge;

        public String getSexo() {
                return Sexo;
        }

        public void setSexo(String sexo) {
                Sexo = sexo;
        }

        public String getNumeroDeCuenta() {
                return NumeroDeCuenta;
        }

        public void setNumeroDeCuenta(String numeroDeCuenta) {
                NumeroDeCuenta = numeroDeCuenta;
        }

        public String getNombreDeConyuge() {
                return NombreDeConyuge;
        }

        public void setNombreDeConyuge(String nombreDeConyuge) {
                NombreDeConyuge = nombreDeConyuge;
        }
}
