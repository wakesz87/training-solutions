package week02.projektmunka;

import java.util.ArrayList;
import java.util.List;

public class Office {

    public List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
        System.out.println(meetingRooms.size());
    }


    public void printNames() {
        System.out.println("printNames");

        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size(); i > -1; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEven() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (i % 2 == 0)
                System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            String a;
            a = "tárgyaló " + meetingRoom.getName();
            a = a + "széleeség " + meetingRoom.getWidth();
            a = a + "hosszúság " + meetingRoom.getLength();
            a = a + "terület " + meetingRoom.getWidth() * meetingRoom.getLength();
            System.out.println(a);
        }
    }



    public void printMeetingRoomsName(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            String a;
            String room = meetingRoom.getName();
            if (room.equals(name)) {
                a = "tárgyaló: " + room;
                a = a + " szélesség: " + meetingRoom.getWidth();
                a = a + " hosszúság: " + meetingRoom.getLength();
                a = a + " terület: " + meetingRoom.getWidth() * meetingRoom.getLength();
                System.out.println((a));
            }
        }
    }
        public void printMeetingsRoomContains(String part){
            for (MeetingRoom meetingRoom: meetingRooms) {
                String a;
                String room = (meetingRoom.getName());
                // String room2= room.toLowerCase;
                if (room.contains(part)) {
                   a = "tárgyaló: " + meetingRoom.getName();
                   a = a + " szélesség: " + meetingRoom.getWidth();
                   a = a + " hosszúság: " + meetingRoom.getLength();
                   a = a + " terület: " + meetingRoom.getWidth()*meetingRoom.getLength();
                    System.out.println((a));

        }
            }
}

    public void printAreasLarger(int area) {
        for(int i = 0; i < meetingRooms.size(); i++) {
            String a;
            int room = meetingRooms.get(i).getWidth()*meetingRooms.get(i).getLength();
            if (room > area) {
                a = "tárgyaló: " + meetingRooms.get(i).getName();
                a = a + " szélesség: " + meetingRooms.get(i).getWidth();
                a = a + " hosszúság: " + meetingRooms.get(i).getLength();
                a = a + " terület: " + meetingRooms.get(i).getWidth()*meetingRooms.get(i).getLength();
                System.out.println((a));
                i = meetingRooms.size()+1;
            }
        }
}
    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }
}

