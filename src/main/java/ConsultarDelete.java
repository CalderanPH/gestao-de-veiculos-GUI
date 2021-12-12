import javax.swing.*;
import java.lang.String;


public class ConsultarDelete extends javax.swing.JFrame {
    private Passeio passeio = new Passeio();
    private BDVeiculos bdVeiculos = new BDVeiculos();
   
    private static ConsultarDelete consultarDelete;
   
    public ConsultarDelete() {
        initComponents();
    }

  public static ConsultarDelete getConsultarDelete() {
        if (consultarDelete == null) {
            consultarDelete = new ConsultarDelete();
        }
        return consultarDelete;
    }

    public void consultarPlaca() {
        passeio = new Passeio();
        try {
            passeio.setPlaca(Integer.parseInt(ctPlaca.getText()));

            passeio = bdVeiculos.consPasseio(passeio);

            if (passeio != null) {
                ctPassageiros.setText(String.valueOf(passeio.getQtdPassageiros()));
                ctMarca.setText(passeio.getMarca());
                ctModelo.setText(passeio.getModelo());
                ctCor.setText(passeio.getCor());
                ctRodas.setText(String.valueOf(passeio.getQtdRodas()));
                ctVelocMax.setText(String.valueOf(passeio.getVelocMax()));
                ctPistoes.setText(String.valueOf(passeio.getMotor().getQtdPist()));
                ctPotencia.setText(String.valueOf(passeio.getMotor().getPontencia()));
                JOptionPane.showMessageDialog(null, "Veículo consultado com sucesso ", "Consulta ok", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Placa não encontrada! ", "Veículo não localizado", 0);
                ctPlaca.setText("");
                ctPlaca.requestFocus();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, deve ser um número inteiro", "Erro Placa", JOptionPane.ERROR_MESSAGE);
            limpar();
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado! ", "Erro Placa", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
        limpar();
    }

    public void limpar() {
        ctPassageiros.setText("");
        ctPlaca.setText("");
        ctMarca.setText("");
        ctModelo.setText("");
        ctCor.setText("");
        ctRodas.setText("");
        ctVelocMax.setText("");
        ctVelocMax.setText("");
        ctPistoes.setText("");
        ctPotencia.setText("");
        ctPlaca.requestFocus();
    }


    public void excluir() {
        passeio = new Passeio();
        try {
            passeio.setPlaca(Integer.parseInt(ctPlaca.getText()));

            bdVeiculos.removePasseioPlaca(passeio);
            if (passeio == null) {
                ctPlaca.setText(String.valueOf(passeio.getPlaca()));

                JOptionPane.showMessageDialog(null, "Veículos impressos com sucesso", "IMPRESSO", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Veículo deletado com sucesso", "Delete", 1);
                ctPlaca.setText("");
                ctPlaca.requestFocus();
            }
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo Informado", "Erro Delete", 0);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlaca = new javax.swing.JLabel();
        lblPassageiros = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblRodas = new javax.swing.JLabel();
        lblVelocMax = new javax.swing.JLabel();
        lblPistoes = new javax.swing.JLabel();
        lblPotencia = new javax.swing.JLabel();
        ctPlaca = new javax.swing.JTextField();
        ctPassageiros = new javax.swing.JTextField();
        ctMarca = new javax.swing.JTextField();
        ctModelo = new javax.swing.JTextField();
        ctCor = new javax.swing.JTextField();
        ctRodas = new javax.swing.JTextField();
        ctVelocMax = new javax.swing.JTextField();
        ctPistoes = new javax.swing.JTextField();
        ctPotencia = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar / Deletar");

        lblPlaca.setText("Informe a Placa");

        lblPassageiros.setText("Qtd. Passageiros");

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        lblCor.setText("Cor");

        lblRodas.setText("Qtd. Rodas");

        lblVelocMax.setText("Velocidade Máxima");

        lblPistoes.setText("Qtd. Pistões");

        lblPotencia.setText("Potência");

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVelocMax)
                                    .addComponent(lblPistoes)
                                    .addComponent(lblPotencia))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctVelocMax)
                                    .addComponent(ctPistoes)
                                    .addComponent(ctPotencia)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPlaca)
                                    .addComponent(lblPassageiros)
                                    .addComponent(lblMarca)
                                    .addComponent(lblModelo)
                                    .addComponent(lblCor)
                                    .addComponent(lblRodas))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ctPassageiros)
                                                .addComponent(ctRodas)
                                                .addComponent(ctPlaca))
                                            .addComponent(ctMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ctModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ctCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(156, 156, 156))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(ctPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassageiros)
                    .addComponent(ctPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(ctMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(ctModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCor)
                    .addComponent(ctCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRodas)
                    .addComponent(ctRodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVelocMax)
                    .addComponent(ctVelocMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPistoes)
                    .addComponent(ctPistoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPotencia)
                    .addComponent(ctPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarPlaca();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctCor;
    private javax.swing.JTextField ctMarca;
    private javax.swing.JTextField ctModelo;
    private javax.swing.JTextField ctPassageiros;
    private javax.swing.JTextField ctPistoes;
    private javax.swing.JTextField ctPlaca;
    private javax.swing.JTextField ctPotencia;
    private javax.swing.JTextField ctRodas;
    private javax.swing.JTextField ctVelocMax;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPassageiros;
    private javax.swing.JLabel lblPistoes;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblRodas;
    private javax.swing.JLabel lblVelocMax;
    // End of variables declaration//GEN-END:variables
}
