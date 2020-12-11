package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/home")
  public String home(Model model){
    //criar novo pedido
    Pedido pedido = new Pedido();
    pedido.setDescricao("descricao para o pedido");
    pedido.setNome("Kindle Gração 10");
    pedido.setUrlImg("https://images-na.ssl-images-amazon.com/images/I/61hMIc0hPYL._AC_SL1000_.jpg");
    pedido.setUrlProduto("https://www.amazon.com.br/Kindle-10a-gera%C3%A7%C3%A3o-ilumina%C3%A7%C3%A3o-embutida/dp/B07FQK1TS9/ref=asc_df_B07FQK1TS9/?tag=googleshopp00-20&linkCode=df0&hvadid=432951822456&hvpos=&hvnetw=g&hvrand=4229017280540010499&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001773&hvtargid=pla-901759904091&psc=1");

    List<Pedido> pedidos = Arrays.asList(pedido);
    model.addAttribute("pedidos", pedidos);
    model.addAttribute("oi", "feliz");
    return "home";
  }
}
