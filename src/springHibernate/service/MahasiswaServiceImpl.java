package springHibernate.service;

import springHibernate.dao.MahasiswaDao;
import springHibernate.model.Mahasiswa;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

@Service("MahasiswaService")
@Transactional(readOnly=true)
public class MahasiswaServiceImpl implements MahasiswaService{
    @Autowired
    private MahasiswaDao mahasiswaDao;
    
    @Transactional
    @Override
    public void save(Mahasiswa mahasiswa) {
        mahasiswaDao.save(mahasiswa); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public void update(Mahasiswa mahasiswa) {
        mahasiswaDao.update(mahasiswa); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public void delete(Mahasiswa mahasiswa) {
        mahasiswaDao.delete(mahasiswa); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public Mahasiswa getMahasiswa(String npm) {
        return mahasiswaDao.getMahasiswa(npm); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public List<Mahasiswa> getMahasiswas() {
       return mahasiswaDao.getMahasiswas(); //To change body of generated methods, choose Tools | Templates.
    }
}
