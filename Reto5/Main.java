import java.util.EnumSet;

enum Permiso { LEER, ESCRIBIR, BORRAR, ADMINISTRAR }

enum Rol {
    ADMIN(EnumSet.allOf(Permiso.class)),
    USUARIO(EnumSet.of(Permiso.LEER, Permiso.ESCRIBIR)),
    INVITADO(EnumSet.of(Permiso.LEER));

    private final EnumSet<Permiso> permisos;
    Rol(EnumSet<Permiso> permisos) { this.permisos = permisos; }

    boolean puede(Permiso p) { return permisos.contains(p); }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("ADMIN puede BORRAR: " + Rol.ADMIN.puede(Permiso.BORRAR));
        System.out.println("USUARIO puede ESCRIBIR: " + Rol.USUARIO.puede(Permiso.ESCRIBIR));
        System.out.println("INVITADO puede BORRAR: " + Rol.INVITADO.puede(Permiso.BORRAR));
    }
}
