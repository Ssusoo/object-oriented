package me.ssu.objectoriented.theater.domains.ticket;

import me.ssu.objectoriented.theater.domains.audience.Audience;

/**
 * 6th Step, 판매원
 *  자신이 일하는 매표소를 알고 있어야 함.
 *
 * 9th, Theater의 결합도를 낮춘 설계.
 * 
 * 10th, TicketSeller의 결합도를 낮춘 설계
 *  *Audience에게로 넘겨주면서 결합도를 줄여보기
 *  
 * 13th, TicketOffice의 결합도를 낮춘 설계.
 *  *TickeOffice에 sellTicketTo 메서드 추가하기
 */
public class TicketSeller {

    private TicketOffice ticketOffice;  // 매표소

    /**
     * 6th, 판매원 객체 상태
     * @param ticketOffice
     */
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /**
     * 6th, 매표소의 상태를 볼 수 있는 판매원
     *
     * TicketSeller에서 getTicketOffice 메서드가 제거된 이유?
     *  ticketOffice에 대한 접근은 오직 TicketSeller 안에만 존재하게 됨.
     * @return
     */
//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    /**
     * 9th, Audience의 결합도를 낮춤
     *  ticketOffice에 대한 접근은 오직 TicketSeller안에만 존재.
     *
     * 10th, TicketSeller의 결합도를 낮춘 설계
     *
     * 13th, TicketOffice의 결합도를 낮춘 설계
     *  *TickeOffice에 sellTicketTo 메서드 추가하기
     * @param audience
     */
    public void sellTO(Audience audience) {
        // 10th, TicketSeller의 결합도를 낮춘 설계
//        buy(ticketOffice.getTickets());
        // TODO 13th, TicketOffice의 결합도를 낮춘 설계
//        ticketOffice.plusAmount(audience.buy(ticketOffice.getTickets()));
        ticketOffice.sellTicketTo(audience);

//        // 9th, 초대장이 있는 이벤트 관람객이면
//        if (audience.getBag().hasInvitation()) {
//            // 판매원은 매표소에서 초대장을 티켓으로 교환해줌.
////            Ticket ticket = ticketSeller.getTicketOffice().getTickets();
//            // 결합도를 낮춘 후
//            //  ticketOffice에 대한 접근은 오직 TicketSeller 안에만 존재하게 됨.
//            Ticket ticket = ticketOffice.getTickets();
//
//            // 이벤트 관람객이면 초대장을 티켓으로 교환 후 가방에 넣음.
//            audience.getBag().setTicket(ticket);
//
//        // 초대장이 없는 일반 관람객이면
//        } else {
//            // 판매원은 매표소에서 티켓을 판매함.
////            Ticket ticket = ticketSeller.getTicketOffice().getTickets();
//            // 결합도를 낮춘 후
//            //  ticketOffice에 대한 접근은 오직 TicketSeller 안에만 존재하게 됨.
//            Ticket ticket = ticketOffice.getTickets();
//
//            // 일반 관람객은 가방에서 티켓 금액만큼 차감.
//            audience.getBag().minusAmount(ticket.getFee());
//
//            // 판매원은 매표소에 티켓 금액만큼 증가.
////            ticketSeller.getTicketOffice().plusAccount(ticket.getFee());
//            // 결합도를 낮춘 후
//            //  ticketOffice에 대한 접근은 오직 TicketSeller 안에만 존재하게 됨.
//            ticketOffice.plusAccount(ticket.getFee());
//
//            // 일반 관람객은 돈을 티켓으로 교환 후 가방에 넣음
//            audience.getBag().setTicket(ticket);
//        }
    }
}
