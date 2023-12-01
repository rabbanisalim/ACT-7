package rabbanisalim;
    import java.util.ArrayList;
    import javax.swing.table.DefaultTableModel;

public class controllerpegawai {
    ArrayList<pegawaibaru> ArrayData;
    DefaultTableModel tablelist;
    
    public controllerpegawai(){
        ArrayData = new ArrayList<pegawaibaru>();
    }
    public void InsertData(String nama, String nopeg, String jabatan, Float gaji){
        pegawaibaru pegawai = new pegawaibaru(nama, nopeg, jabatan, gaji);
        ArrayData.add(pegawai);
    }
    public void DeleteData(int rowIndex){
        if (rowIndex >= 0 && rowIndex < ArrayData.size()){
            ArrayData.remove(rowIndex);
        }
    }
    public void UpdateData(int rowIndex, String nama, String nopeg, String jabatan, float gaji){
        if (rowIndex >= 0 && rowIndex < ArrayData.size()){
            pegawaibaru pegawai = ArrayData.get(rowIndex);
            pegawai.setNama(nama);
            pegawai.setNopeg(nopeg);
            pegawai.setJabatan(jabatan);
            pegawai.setGaji(gaji);
        }
    }
    public DefaultTableModel showData(){
        String[] kolom = {"Nama", "NOPEG", "Jabatan", "Gaji"};
        Object[][] objData = new Object [ArrayData.size()][3];
        int i = 0;
        
        for(pegawaibaru n : ArrayData){
            String[] arrData = {n.getNama(), n.getNOPEG(), n.getJabatan(), String.valueOf(n.gaji)};
            objData[i] = arrData;
            i++;
        }
        
        tablelist = new DefaultTableModel(objData, kolom){
            public boolean inCellEditTable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tablelist;
    }

    void UpdateData(String namaku, String nopegku, String jabatanku, float gajiku) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
