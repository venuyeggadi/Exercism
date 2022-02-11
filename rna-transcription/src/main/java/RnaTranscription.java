class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] dnsStrandArray = dnaStrand.toCharArray();
        for(int i = 0; i < dnsStrandArray.length; i++) {
            if(dnsStrandArray[i] == 'G')
                dnsStrandArray[i] = 'C';
            else if(dnsStrandArray[i] == 'C')
                dnsStrandArray[i] = 'G';
            else if(dnsStrandArray[i] == 'T')
                dnsStrandArray[i] = 'A';
            else if(dnsStrandArray[i] == 'A')
                dnsStrandArray[i] = 'U';
        }

        return new String(dnsStrandArray);
    }

}
