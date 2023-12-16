import com.manzano.app.generics.cargadores.*;
import com.manzano.app.generics.celulares.CelularApple;
import com.manzano.app.generics.celulares.CelularSamsung;
import com.manzano.app.generics.celulares.CelularXiaomi;
import com.manzano.app.generics.enums.Color;

public class C1 {

    public static void main(String[] args) {

        CelularApple i10 = new CelularApple();

        i10.setModelo("Iphone 10");
        i10.setMemoriaRam(4F);
        i10.setMemoriaRom(64F);
        i10.setImei("12838T374S");
        i10.setCapacidadBateria(12F);
        i10.setBotonSilencioEstado(true);
        i10.setColor(Color.DORADO);

        CelularSamsung m1 = new CelularSamsung();

        m1.setModelo("S22");
        m1.setMemoriaRam(6F);
        m1.setMemoriaRom(128F);
        m1.setImei("12838T374S");
        m1.setCapacidadBateria(19F);
        m1.setColor(Color.AZUL);

        CelularXiaomi poco = new CelularXiaomi();

        poco.setModelo("Xiaomi POCO X1");
        poco.setMemoriaRam(6F);
        poco.setMemoriaRom(128F);
        poco.setImei("12838T374S");
        poco.setCapacidadBateria(26F);
        poco.setColor(Color.GRIS);

        IAppleCargador cargadorAppleLento = new CargadorNormalApple();
        IAppleCargador cargadorAppleRapido = new CargadorRapidoApple();

        ISamsungCargador cargadorSamsungLento = new CargadorNormalSamsung();
        ISamsungCargador cargadorSamsungRapido = new CargadorRapidoSamsung();
        ISamsungCargador cargadorSamsungInduccion = new CargadorInduccionSamsung();

        IXiaomiCargador cargadorXiaomiLento = new CargadorNormalXiaomi();
        IXiaomiCargador cargadorXiaomiRapido = new CargadorRapidoXiaomi();

        // hoy

        cargadorAppleLento.cargar(i10);
        cargadorSamsungLento.cargar(m1);
        cargadorXiaomiRapido.cargar(poco);

        // mañana

        cargadorAppleLento.cargar(i10);
        cargadorSamsungInduccion.cargar(m1);
        cargadorXiaomiRapido.cargar(poco);

    }
}
