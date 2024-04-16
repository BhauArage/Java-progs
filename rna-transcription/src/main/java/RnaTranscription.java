class RnaTranscription {

    String transcribe(String dnaStrand) {
        String result="";
        for (int i = 0; i < dnaStrand.length(); i++) {
            switch (dnaStrand.charAt(i)){
                case 'A':
                    result+="U";
                    break;
                case 'G':
                    result+="C";
                    break;
                case 'T':
                    result+="A";
                    break;
                case 'C':
                    result+="G";
                    break;
            }
        }
        return result;
    }

}
