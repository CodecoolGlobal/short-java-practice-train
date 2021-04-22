Implementáld az alábbi leírás szerinti java code-ot:

###Wagon osztály:
- nem lehet közvetlenül példányosítani a csak a Wagon osztályból leszármazott osztályok példányosításakor jöhet létre új vagon.
- két privát fieldje van: `int cargoMassInTons` szállítható rakomány és `int numberOfPassengerSeats` szállítható utas mennyiség.
- minden field-jéhez tartozik getter.

###CargoWagon osztály
- a Wagon osztályból származik le.
- a szállítható utasok száma alapértelmezetten 0.
- a szállítható rakomány alapértelmezetten 30 tonna.

###PassengerWagon osztály
- a Wagon osztályból származik le.
- a szállítható utasok száma alapértelmezetten 50.
- a szállítható rakomány alapértelmezetten 0 tonna.

###Train osztály
- egy privát fieldje van ami a wagonok listáját tartalmazza. ehhez tartozik egy getter.
- két constructora van:
  - egyik constructora közvetlenül a wagon listát kapja paraméternek
  - másik constructora paraméterei `int numOfPassengers, int cargoInTons`. Ez alapján hoz létre egy olyan vonatot ami képes elszállítani a paraméterben megkapott utas és rakomány mennyiséget de a lehető legkevesebb vagont tartalmazza.
- `int getNumOfWagons()` a vagonok számát adja vissza.
- `int getPassengerCapacity()` a vonat által szállítható utasmennyiséget adja vissza.
- `int getCargoCapacity()` a vonat által szállítható rakománymennyiséget adja vissza tonnában.
