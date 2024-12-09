import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import com.anabelenhernandez.despensainteligente.model.Producto;
import com.anabelenhernandez.despensainteligente.repository.ProductoRepository;
import com.anabelenhernandez.despensainteligente.service.ProductoService;
@ExtendWith(MockitoExtension.class)
public class ProductoServiceTest {

    @InjectMocks
    private ProductoService productoService;

    @Mock
    private ProductoRepository productoRepository;

    @Test
    public void testObtenerProductosProximosACaducar() {
        // Mock data
        LocalDate hoy = LocalDate.now();
        Date fechaHoy = java.sql.Date.valueOf(hoy);
        Date fechaLimite = java.sql.Date.valueOf(hoy.plusDays(3));

        List<Producto> productosMock = Arrays.asList(new Producto("Leche", "MarcaA", fechaHoy));
        when(productoRepository.findByFechaCaducidadBetween(fechaHoy, fechaLimite))
            .thenReturn(productosMock);

        // Call the method
        List<Producto> resultado = productoService.obtenerProductosProximosACaducar();

        // Assertions
        assertNotNull(resultado);
        assertEquals(1, resultado.size());
        assertEquals("Leche", resultado.get(0).getNombre());

        // Verify interaction with the repository
        verify(productoRepository, times(1)).findByFechaCaducidadBetween(fechaHoy, fechaLimite);
    }
}
