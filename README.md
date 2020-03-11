# Farmacie - Progetto creato da Marco Compagnoni e Riccardo Forconi
Repository per progetto del corso di Programmazione a oggetti

# Obbiettivi del programma
1) Andando a prendere il data-set fornito alla consegna dobbiamo collegarci al relativo URL. Il formato in cui troveremo 
i dati all'interno del programma sarà in formato JSON.
2) Andare a scaricare il contenuto del testo all'interno dell'URL in una stringa nel nostro programma.
3) Andiamo a prendere soltanto il campo 1: in resources, in particolare l'URL di quest'ultimo, alla quale 
dobbiamo collegarci per andare a prendere le info relative a tutte le farmacie presenti in Campania. Queste info
saranno presenti in formato JSON e, così come sono, le portiamo all'interno di un file di testo.
4) Andando a riprendere il file con le info andiamo a salvare ogni farmacia in un oggetto che, intuitivamente, 
chiameremo "Farmacia" all'interno del file "Farmacia.java" che descriveremo poi.
5) In farmacia andiamo a impostare i metodi che permettono il cambiamento e il reperimento delle informazioni
relative ad ogni farmacia, andando quindi a definire le basi per eventuali filtri di ricerca e modifiche.
6) Andiamo a costruire un'applicazione (main) che ci permette effettivamente di costruire un vettore di oggetti di
farmacie. Su di esso creeremo poi un menù che permetterà:
- la modifica delle informazioni relative alla farmacia
- la ricerca della farmacia anche attraverso l'impostazione di diversi filtri.
7) Andiamo a simulare un comportamento di un'eventuale applicazione web basata sull'applicazione costruita fino ad ora
utilizzando SpringBoot e Postman.

# Compagnoni-Forconi/project.SpringBootApplication/src/main/java/com/univpm/project/.
all'interno di questo percorso troviamo tutte i file relativi al progetto sviluppato.

### "SpringBootApplication" folder
all'interno di questa cartella troviamo il main attraverso il quale possiamo eseguire il programma. 
L'eseguibile si chiama Application.java e alla cartella viene dato questo nome dato che utilizziamo i servizi SpringBoot 
per utilizzare la nostra applicazione simulando il suo inserimento in un web server.

### "model" folder
All'interno della cartella model troviamo il file "Farmacia.java". Questo file è un file attraverso il quale definiamo 
il tipo di oggetto che andiamo poi ad immagazzinare nel vettore di oggetti "Farmacia", utilizzato per il funzionamento del
programma

### "controller" folder
nella cartella controller andiamo ad inserire i comandi per definire la rotta per reperire le informazioni relative ai
dati delle diverse farmacie che vogliamo andare ad immagazzinare nel programma

### "service" folder
In service andiamo ad implementare le funzioni che verrann poi utilizzate in Farmacie.java

### "utilities" folder
attraverso questa cartella andiamo a scaricare il testo presente all'interno del data-set fornito alla consegna.
All'interno della cartella sono presenti 3 file:
- Connection: effettua il collegamento URL per riprendere, come detto precedentemente, il testo descritto all'interno del
data-set fornito alla consegna
- Parsing: prende, dal data-set, soltanto la sezione resources che a noi interessa, andando a selezionare specificatamente
i file in formato JSON che dobbiamo poi elaborare all'interno del programma. All'interno del programma possiamo 
andare ad analizzare i commenti relativi ai metodi presenti nel file.
- CreaStruct: inserisce i dati del file da noi creato in uno dei metodi del file Parsing all'interno del vettore di 
"Farmacia" permettondoci quindi di avere la struttura su cui poi possiamo lavorare.
