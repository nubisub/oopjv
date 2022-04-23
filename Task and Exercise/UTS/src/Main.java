public class Main {
    public static void main(String[] args) {


        
        // Contoh untuk Exception
        String mediaType = "Yahoo";
        String contentType = "Video";

        // Contoh untuk Chat
        // String mediaType = "Chat";
        // String contentType = "table";

        // Contoh untuk Media Sosial
        // String mediaType = "Media Sosial";
        // String contentType = "infografis";

        // Contoh untuk Media Email
        // String mediaType = "Email";
        // String contentType = "publikasi";


        try {
            if (mediaType.equals("Media Sosial")) {
                MediaSosial media = new MediaSosial();
                media.share();
                if (contentType.equals("table")) {
                    media.setPenyajian(new Tabel());
                } else if (contentType.equals("infografis")) {
                    media.setPenyajian(new Infografis());
                } else if (contentType.equals("publikasi")) {
                    media.setPenyajian(new Publikasi());
                } else {
                    throw new Exception("Content type tidak diketahui");
                }
                media.getPenyajian().display();
                media.getPenyajian().selectContent();
                media.getPenyajian().generateShareContent();
            } else if (mediaType.equals("Chat")) {
                Chat media = new Chat();
                media.share();
                if (contentType.equals("table")) {
                    media.setPenyajian(new Tabel());
                } else if (contentType.equals("infografis")) {
                    media.setPenyajian(new Infografis());
                } else if (contentType.equals("publikasi")) {
                    media.setPenyajian(new Publikasi());
                } else {
                    throw new Exception("Content type tidak diketahui");
                }
                media.getPenyajian().display();
                media.getPenyajian().selectContent();
                media.getPenyajian().generateShareContent();
            } else if (mediaType.equals("Email")) {
                Email media = new Email();
                media.share();
                if (contentType.equals("table")) {
                    media.setPenyajian(new Tabel());
                } else if (contentType.equals("infografis")) {
                    media.setPenyajian(new Infografis());
                } else if (contentType.equals("publikasi")) {
                    media.setPenyajian(new Publikasi());
                } else {
                    throw new Exception("Content type tidak diketahui");
                }
                media.getPenyajian().display();
                media.getPenyajian().selectContent();
                media.getPenyajian().generateShareContent();
            } else {
                throw new Exception("Media type tidak dikenali");
            }  
        } catch (Exception e) {
            System.out.println(e);
        }

        // Email email = new Email();
        // email.share();
        // email.setPenyajian(new Infografis());
        // email.getPenyajian().display();
        // email.getPenyajian().selectContent();
        // email.getPenyajian().generateShareContent();

        // Chat chat = new Chat();
        // chat.share();
        // chat.setPenyajian(new Tabel());
        // chat.getPenyajian().display();
        // chat.getPenyajian().selectContent();
        // chat.getPenyajian().generateShareContent();

        // MediaSosial medsos = new MediaSosial();
        // medsos.share();
        // medsos.setPenyajian(new Publikasi());
        // medsos.getPenyajian().display();
        // medsos.getPenyajian().selectContent();
        // medsos.getPenyajian().generateShareContent();

    }
}
