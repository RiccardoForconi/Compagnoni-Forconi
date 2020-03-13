Come nel programma del professore inseriamo dei parametri da passare:
Possiamo passare, come nell'esempio iniziale, un parametro

@RestController
public class simpleRestController{
  @GetMapping("/hello")
  public HelloWorldClass exampleMethod(@RequestParam(name="filtro", defaultValue="") String filter1,...)
  }

richiedendo un parametro andiamo, attraverso questo filtro, a ricercare all'interno delle farmacie.

altrimenti possiamo far passare un body (cioè diamo la possibilità di passare un'intera classe Farmacia)
e a seconda dei parametri che passa possiamo andare a fare la ricerca. I parametri che decide di non inserire
non li consideriamo per la ricerca.
