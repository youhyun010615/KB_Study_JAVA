//package self_study.ch08.sec02;
//
//public class Audio implements RemoteControl{
//    private int volume;
//
//    @Override
//    public void turnOn() {
//        System.out.println("오디오를 켭니다.");
//    }
//
//    @Override
//    public void turnoff() {
//        System.out.println("오디오를 끕니다.");
//    }
//
//    @Override
//    public void setVolume(int volume) {
//        if(volume > RemoteControl.MAX_VOLUME){
//            this.volume = MAX_VOLUME;
//        }else if( volume < RemoteControl.MIN_VOLUME){
//            this.volume  = MIN_VOLUME;
//        }
//        else{
//            this.volume = volume;
//        }
//        System.out.println("현재 볼륨은 " + this.volume + "입니다.");
//
//    }
//
//
//}
