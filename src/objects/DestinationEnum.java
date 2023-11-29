package objects;

enum DestinationEnum {

    // for doors
    SOMEWHERE("куда-то"),
    NOWHERE("никуда"),
    // for stairs
    UP("вверх"),
    DOWN("вниз");

    private String destination;

    DestinationEnum(String destination) {

        this.destination = destination;

    }

}
